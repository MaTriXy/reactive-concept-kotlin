package com.baculsoft.sample.kotlinreactive.single

import android.support.v4.content.ContextCompat
import com.baculsoft.sample.kotlinreactive.R
import org.jetbrains.anko.*
import org.jetbrains.anko.appcompat.v7.toolbar
import org.jetbrains.anko.design.coordinatorLayout

class SingleUI : AnkoComponent<SingleActivity> {

    override fun createView(ui: AnkoContext<SingleActivity>) = with(ui) {
        coordinatorLayout {
            backgroundColor = ContextCompat.getColor(ctx, R.color.colorPrimary)

            relativeLayout {
                toolbar {
                    id = R.id.toolbar_single
                    backgroundColor = ContextCompat.getColor(ctx, R.color.colorAccent)
                    setNavigationIcon(R.mipmap.ic_arrow_back)
                    setTitleTextColor(ContextCompat.getColor(ctx, R.color.colorPrimary))
                }.lparams {
                    alignParentTop()
                    width = matchParent
                    height = wrapContent
                }
            }
        }
    }
}