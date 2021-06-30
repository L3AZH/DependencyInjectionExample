package com.example.dependencyinjection.dagger

import com.example.dependencyinjection.car.Rim
import com.example.dependencyinjection.car.Tire
import com.example.dependencyinjection.car.Wheels
import dagger.Module
import dagger.Provides


@Module
class WheelsModule {

    companion object{
        @JvmStatic
        @Provides
        fun providerRim(): Rim {
            return Rim()
        }
        @JvmStatic
        @Provides
        fun providerTire(): Tire {
            val tire = Tire()
            tire.setUpForTire()
            return tire
        }
        @JvmStatic
        @Provides
        fun providerWheel(rim: Rim, tire: Tire): Wheels {
            return Wheels(rim,tire)
        }
    }


}