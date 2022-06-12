package com.santukis.repositories.strategies

interface RepositoryStrategy<Input, Output> {
    suspend fun execute(input: Input): Result<Output>
}

suspend fun <T> Result<T>.getOr(alternative: suspend () -> Result<T>): Result<T> =
    when (this.isSuccess) {
        true -> this
        else -> alternative()
    }