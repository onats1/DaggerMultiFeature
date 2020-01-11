package com.codingwithmitch.daggermultifeature.app.di.keys

import androidx.fragment.app.Fragment
import dagger.MapKey
import kotlin.reflect.KClass

@MapKey
@Target(AnnotationTarget.FUNCTION)
annotation class FragmentKey(val value: KClass<out Fragment>)
