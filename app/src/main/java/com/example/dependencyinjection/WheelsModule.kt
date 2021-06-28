package com.example.dependencyinjection

import dagger.Module
import dagger.Provides


@Module
class WheelsModule {

    @Provides
    fun providerRim():Rim{
        return Rim()
    }
    @Provides
    fun providerTire():Tire{
        val tire = Tire()
        tire.setUpForTire()
        return tire
    }
    @Provides
    fun providerWheel(rim: Rim,tire: Tire):Wheels{
        return Wheels(rim,tire)
    }


}