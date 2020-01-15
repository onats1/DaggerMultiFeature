package com.codingwithmitch.daggermultifeature.feature1.di

import com.codingwithmitch.daggermultifeature.feature1.ui.Feature1MainFragment
import dagger.Subcomponent


@Feature1FragmentScope
@Subcomponent(
    modules = [
        Feature1FragmentBuildersModule::class,
        Feature1ViewModelsModule::class
    ]
)
interface Feature1Component {

    @Subcomponent.Factory
    interface Factory{

        fun create(): Feature1Component
    }

    fun inject(feature1MainFragment: Feature1MainFragment)
}