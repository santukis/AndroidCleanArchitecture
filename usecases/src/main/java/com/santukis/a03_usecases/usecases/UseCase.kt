package com.santukis.a03_usecases.usecases

interface UseCase<Params, Result> {

    suspend operator fun invoke(params: Params): Result
}