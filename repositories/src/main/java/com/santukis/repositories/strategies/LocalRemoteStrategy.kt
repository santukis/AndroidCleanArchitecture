package com.santukis.repositories.strategies

abstract class LocalRemoteStrategy<Input, Output>: RepositoryStrategy<Input, Output> {

    protected abstract suspend fun loadFromLocal(input: Input): Result<Output>

    protected abstract suspend fun loadFromRemote(input: Input): Result<Output>

    protected abstract suspend fun saveIntoLocal(output: Result<Output>): Result<Output>

    override suspend fun execute(input: Input): Result<Output> {
        return loadFromLocal(input).getOr {
            val remote = loadFromRemote(input)

            when (remote.isSuccess) {
                true -> saveIntoLocal(remote)
                else -> remote
            }
        }
    }
}