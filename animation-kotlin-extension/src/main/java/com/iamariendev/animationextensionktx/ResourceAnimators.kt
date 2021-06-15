package com.iamariendev.animationextensionktx

import android.content.Context
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils

/**
 * View Extension To Add Shake Animation To Your Views
 * @author Norman Jay Palisoc
 * @param context application context needed in loading resource animations
 * @param fillAfter by default (true), tells if the animated view will stay in its animated position
 * @param repeatCount by default (5), tells how many shake animation will be done
 * @param animationListener by default (null), to monitor the animation by way of its listener in your own implementation
 */
fun View.addShakeAnimation(
    context: Context,
    fillAfter: Boolean = true,
    repeatCount: Int = 5,
    animationListener: Animation.AnimationListener?
) {
    val animation: Animation = AnimationUtils.loadAnimation(context, R.anim.shrink_animation)
    animation.fillAfter = fillAfter
    animation.repeatCount = repeatCount
    animation.setAnimationListener(animationListener)
    startAnimation(animation)
}

/**
 * View Extension To Add Push Down In Animation To Your Views
 * @author Norman Jay Palisoc
 * @param context application context needed in loading resource animations
 * @param duration the duration of animation
 * @param fillAfter by default (true), tells if the animated view will stay in its animated position
 * @param animationListener by default (null), to monitor the animation by way of its listener in your own implementation
 */
fun View.addPushDownInAnimation(
    context: Context, duration: Long, fillAfter: Boolean = true,
    animationListener: Animation.AnimationListener? = null
) {
    val animation: Animation = AnimationUtils.loadAnimation(context, R.anim.push_down_in)
    animation.duration = duration
    animation.fillAfter = fillAfter
    animation.setAnimationListener(animationListener)
    startAnimation(animation)
}

/**
 * View Extension To Add Push Down Out Animation To Your Views
 * @author Norman Jay Palisoc
 * @param context application context needed in loading resource animations
 * @param duration the duration of animation
 * @param fillAfter by default (true), tells if the animated view will stay in its animated position
 * @param animationListener by default (null), to monitor the animation by way of its listener in your own implementation
 */
fun View.addPushDownOutAnimation(
    context: Context, duration: Long, fillAfter: Boolean = true,
    animationListener: Animation.AnimationListener? = null
) {
    val animation: Animation = AnimationUtils.loadAnimation(context, R.anim.push_down_out)
    animation.duration = duration
    animation.fillAfter = fillAfter
    animation.setAnimationListener(animationListener)
    startAnimation(animation)
}

/**
 * View Extension To Add Push Left In Animation To Your Views
 * @author Norman Jay Palisoc
 * @param context application context needed in loading resource animations
 * @param duration the duration of animation
 * @param fillAfter by default (true), tells if the animated view will stay in its animated position
 * @param animationListener by default (null), to monitor the animation by way of its listener in your own implementation
 */
fun View.addPushLeftInAnimation(
    context: Context, duration: Long, fillAfter: Boolean = true,
    animationListener: Animation.AnimationListener? = null
) {
    val animation: Animation = AnimationUtils.loadAnimation(context, R.anim.push_left_in)
    animation.duration = duration
    animation.fillAfter = fillAfter
    animation.setAnimationListener(animationListener)
    startAnimation(animation)
}

/**
 * View Extension To Add Push Left Out Animation To Your Views
 * @author Norman Jay Palisoc
 * @param context application context needed in loading resource animations
 * @param duration the duration of animation
 * @param fillAfter by default (true), tells if the animated view will stay in its animated position
 * @param animationListener by default (null), to monitor the animation by way of its listener in your own implementation
 */
fun View.addPushLeftOutAnimation(
    context: Context, duration: Long, fillAfter: Boolean = true,
    animationListener: Animation.AnimationListener? = null
) {
    val animation: Animation = AnimationUtils.loadAnimation(context, R.anim.push_left_out)
    animation.duration = duration
    animation.fillAfter = fillAfter
    animation.setAnimationListener(animationListener)
    startAnimation(animation)
}

/**
 * View Extension To Add Push Right In Animation To Your Views
 * @author Norman Jay Palisoc
 * @param context application context needed in loading resource animations
 * @param duration the duration of animation
 * @param fillAfter by default (true), tells if the animated view will stay in its animated position
 * @param animationListener by default (null), to monitor the animation by way of its listener in your own implementation
 */
fun View.addPushRightInAnimation(
    context: Context, duration: Long, fillAfter: Boolean = true,
    animationListener: Animation.AnimationListener? = null
) {
    val animation: Animation = AnimationUtils.loadAnimation(context, R.anim.push_right_in)
    animation.duration = duration
    animation.fillAfter = fillAfter
    animation.setAnimationListener(animationListener)
    startAnimation(animation)
}

/**
 * View Extension To Add Push Right Out Animation To Your Views
 * @author Norman Jay Palisoc
 * @param context application context needed in loading resource animations
 * @param duration the duration of animation
 * @param fillAfter by default (true), tells if the animated view will stay in its animated position
 * @param animationListener by default (null), to monitor the animation by way of its listener in your own implementation
 */
fun View.addPushRightOutAnimation(
    context: Context, duration: Long, fillAfter: Boolean = true,
    animationListener: Animation.AnimationListener? = null
) {
    val animation: Animation = AnimationUtils.loadAnimation(context, R.anim.push_right_out)
    animation.duration = duration
    animation.fillAfter = fillAfter
    animation.setAnimationListener(animationListener)
    startAnimation(animation)
}

/**
 * View Extension To Add Push In Out Animation To Your Views
 * @author Norman Jay Palisoc
 * @param context application context needed in loading resource animations
 * @param duration the duration of animation
 * @param fillAfter by default (true), tells if the animated view will stay in its animated position
 * @param animationListener by default (null), to monitor the animation by way of its listener in your own implementation
 */
fun View.addPushUpInAnimation(
    context: Context, duration: Long, fillAfter: Boolean = true,
    animationListener: Animation.AnimationListener? = null
) {
    val animation: Animation = AnimationUtils.loadAnimation(context, R.anim.push_up_in)
    animation.duration = duration
    animation.fillAfter = fillAfter
    animation.setAnimationListener(animationListener)
    startAnimation(animation)
}

/**
 * View Extension To Add Push Up Out Animation To Your Views
 * @author Norman Jay Palisoc
 * @param context application context needed in loading resource animations
 * @param duration the duration of animation
 * @param fillAfter by default (true), tells if the animated view will stay in its animated position
 * @param animationListener by default (null), to monitor the animation by way of its listener in your own implementation
 */
fun View.addPushUpOutAnimation(
    context: Context, duration: Long, fillAfter: Boolean = true,
    animationListener: Animation.AnimationListener? = null
) {
    val animation: Animation = AnimationUtils.loadAnimation(context, R.anim.push_up_out)
    animation.duration = duration
    animation.fillAfter = fillAfter
    animation.setAnimationListener(animationListener)
    startAnimation(animation)
}

/**
 * View Extension To Add Shrink And Rotate Animation To Your Views
 * @author Norman Jay Palisoc
 * @param context application context needed in loading resource animations
 * @param duration the duration of animation
 * @param fillAfter by default (true), tells if the animated view will stay in its animated position
 * @param animationListener by default (null), to monitor the animation by way of its listener in your own implementation
 */
fun View.addShrinkAndRotateAnimation(
    context: Context, duration: Long, fillAfter: Boolean = true,
    animationListener: Animation.AnimationListener? = null
) {
    val animation: Animation = AnimationUtils.loadAnimation(context, R.anim.shrink_and_rotate)
    animation.duration = duration
    animation.fillAfter = fillAfter
    animation.setAnimationListener(animationListener)
    startAnimation(animation)
}