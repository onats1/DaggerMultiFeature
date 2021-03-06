package com.codingwithmitch.daggermultifeature.feature1.repository

import com.codingwithmitch.daggermultifeature.feature1.data.Feature1LocalDataSource
import com.codingwithmitch.daggermultifeature.feature1.di.Feature1FragmentScope
import javax.inject.Inject

@Feature1FragmentScope
class Feature1RepositoryImpl
@Inject
constructor(
    private val feature1LocalDataSource: Feature1LocalDataSource
): Feature1Repository{

    override suspend fun getFeature1MainString(): String {
        return feature1LocalDataSource.getFeature1MainString()
    }

    override suspend fun getFeature1NextString(): String {
        return feature1LocalDataSource.getFeature1NextString()
    }

    override suspend fun getFeature1FinalString(): String {
        return feature1LocalDataSource.getFeature1FinalString()
    }
}