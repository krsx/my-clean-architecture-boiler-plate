package com.project.cleaarchitecureboilerplate.core.domain.usecase

import com.project.cleaarchitecureboilerplate.core.data.source.Resource
import com.project.cleaarchitecureboilerplate.core.domain.model.Tourism
import kotlinx.coroutines.flow.Flow

interface TourismUseCase {
    fun getAllTourism(): Flow<Resource<List<Tourism>>>

    fun getFavoriteTourism(): Flow<List<Tourism>>

    fun setFavoriteTourism(tourism: Tourism, state: Boolean)
}