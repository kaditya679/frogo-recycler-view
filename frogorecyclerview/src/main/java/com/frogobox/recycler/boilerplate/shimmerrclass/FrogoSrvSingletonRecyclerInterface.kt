package com.frogobox.recycler.boilerplate.shimmerrclass

import com.frogobox.recycler.boilerplate.viewrclass.FrogoViewAdapterCallback
import com.frogobox.recycler.widget.FrogoRecyclerView

/*
 * Created by Faisal Amir on 04/06/2020
 * FrogoRecyclerView Source Code
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) 2020 FrogoBox Inc.      
 * All rights reserved
 *
 */
 
interface FrogoSrvSingletonRecyclerInterface<T> {

    fun initSingleton(frogoRecyclerView: FrogoRecyclerView): FrogoSrvSingletonRecycler<T>

    fun createLayoutLinearVertical(dividerItem: Boolean): FrogoSrvSingletonRecycler<T>

    fun createLayoutLinearHorizontal(dividerItem: Boolean): FrogoSrvSingletonRecycler<T>

    fun createLayoutStaggeredGrid(spanCount: Int): FrogoSrvSingletonRecycler<T>

    fun createLayoutGrid(spanCount: Int): FrogoSrvSingletonRecycler<T>

    fun addData(listData: List<T>): FrogoSrvSingletonRecycler<T>

    fun addCustomView(customViewInt: Int): FrogoSrvSingletonRecycler<T>

    fun addEmptyView(emptyViewInt: Int?): FrogoSrvSingletonRecycler<T>

    fun addCallback(frogoViewAdapterCallback: FrogoViewAdapterCallback<T>): FrogoSrvSingletonRecycler<T>

    fun build(): FrogoSrvSingletonRecycler<T>
    
}