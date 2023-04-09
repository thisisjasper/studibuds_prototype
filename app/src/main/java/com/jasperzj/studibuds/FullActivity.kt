package com.jasperzj.studibuds

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.animation.LinearInterpolator
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DefaultItemAnimator
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.jasperzj.studibuds.card.AppData
import com.jasperzj.studibuds.card.CardStackAdapter
import com.yuyakaido.android.cardstackview.*

class FullActivity : AppCompatActivity() {
//    private val cardstackview by lazy { findViewById<CardStackView>(R.id.card_stack_view)}
//    private val manager by lazy { CardStackLayoutManager(this, this)}
//    private val adapter by lazy { CardStackAdapter(AppData.carddatas) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_full)
        Log.i("DINGIGNIGD", AppData.discordTag)

        val home = HomeFragment()
        val profile = ProfileFragment()

        setNewCurrentFragment(profile)

        var bottomNavView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        bottomNavView.setOnItemSelectedListener { it ->
            when(it.itemId) {
                R.id.home -> setNewCurrentFragment(home)
                R.id.profile -> setNewCurrentFragment(profile)
            }
            true
        }
//
//        manager.setStackFrom(StackFrom.None)
//        manager.setVisibleCount(3)
//        manager.setTranslationInterval(8.0f)
//        manager.setScaleInterval(0.95f)
//        manager.setSwipeThreshold(0.3f)
//        manager.setMaxDegree(20.0f)
//        manager.setDirections(Direction.HORIZONTAL)
//        manager.setCanScrollHorizontal(true)
//        manager.setCanScrollVertical(true)
//        manager.setSwipeableMethod(SwipeableMethod.AutomaticAndManual)
//        manager.setOverlayInterpolator(LinearInterpolator())
//        cardstackview.layoutManager = manager
//        cardstackview.adapter = adapter
//        cardstackview.itemAnimator.apply {
//            if (this is DefaultItemAnimator) {
//                supportsChangeAnimations = false
//            }
//        }
    }

    private fun setNewCurrentFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fl_fragment, fragment)
            commit()
        }
    }
}