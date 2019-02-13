package com.example.guyverhopkins.bottomnavigationviewsample.facts

import com.example.guyverhopkins.bottomnavigationviewsample.core.common.PerFragment
import dagger.Module
import dagger.Provides

/**
 * TODO Create class header 1/30/17.
 */

@Module
class FactsModule {

    //    FactsView view;
    //
    //    public FactsModule(FactsView view){
    //        this.view = view;
    //    }

    @Provides
    fun providesFactsPresenter(): FactsPresenter = FactsPresenter()
}
