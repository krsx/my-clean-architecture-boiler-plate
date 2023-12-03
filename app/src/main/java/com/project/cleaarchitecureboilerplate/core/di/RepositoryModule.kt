package com.project.cleaarchitecureboilerplate.core.di

import com.project.cleaarchitecureboilerplate.core.data.repository.TourismRepository
import com.project.cleaarchitecureboilerplate.core.domain.repository.ITourismRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module(includes = [NetworkModule::class, DatabaseModule::class])
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun provideRepository(tourismRepository: TourismRepository): ITourismRepository

}