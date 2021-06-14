package com.iamariendev.animationextensionktx

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.animation.ObjectAnimator
import android.animation.PropertyValuesHolder
import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import android.graphics.drawable.Icon
import android.view.View
import android.view.animation.*
import android.widget.ImageView
import androidx.annotation.DrawableRes

/**
 * View Extension To Add Slide Up Animation To Your Views
 * @author Norman Jay Palisoc
 * @param duration the duration of animation
 * @param fillAfter by default (true), tells if the animated view will stay in its animated position
 * @param animationListener by default (null), to monitor the animation by way of its listener in your own implementation
 */
fun View.addSlideUpAnimation(
    duration: Long,
    fillAfter: Boolean = true,
    animationListener: Animation.AnimationListener? = null
) {
    val scaleAnimation = ScaleAnimation(1f, 1f, 1f, 0f)
    scaleAnimation.interpolator = LinearInterpolator()
    scaleAnimation.duration = duration
    scaleAnimation.fillAfter = fillAfter
    scaleAnimation.setAnimationListener(animationListener)
    startAnimation(scaleAnimation)
}

/**
 * View Extension To Add Slide Down Animation To Your Views
 * @author Norman Jay Palisoc
 * @param duration the duration of animation
 * @param fillAfter by default (true), tells if the animated view will stay in its animated position
 * @param animationListener by default (null), to monitor the animation by way of its listener in your own implementation
 */
fun View.addSlideDownAnimation(
    duration: Long,
    fillAfter: Boolean = true,
    animationListener: Animation.AnimationListener? = null
) {
    val scaleAnimation = ScaleAnimation(1f, 1f, 0f, 1f)
    scaleAnimation.interpolator = LinearInterpolator()
    scaleAnimation.duration = duration
    scaleAnimation.fillAfter = fillAfter
    scaleAnimation.setAnimationListener(animationListener)
    startAnimation(scaleAnimation)
}

/**
 * View Extension To Add Blink Animation To Your Views
 * @author Norman Jay Palisoc
 * @param duration the duration of animation
 * @param fillAfter by default (true), tells if the animated view will stay in its animated position
 */
fun View.addBlinkAnimation(duration: Long, fillAfter: Boolean = true) {
    val alphaAnimation = AlphaAnimation(0f, 1f)
    alphaAnimation.interpolator = AccelerateInterpolator()
    alphaAnimation.duration = duration
    alphaAnimation.fillAfter = fillAfter
    alphaAnimation.repeatMode = Animation.REVERSE
    alphaAnimation.repeatCount = Animation.INFINITE
    startAnimation(alphaAnimation)
}

/**
 * View Extension To Add Bounce Animation To Your Views
 * @author Norman Jay Palisoc
 * @param duration the duration of animation
 * @param fillAfter by default (true), tells if the animated view will stay in its animated position
 * @param animationListener by default (null), to monitor the animation by way of its listener in your own implementation
 */
fun View.addBounceAnimation(
    duration: Long,
    fillAfter: Boolean = true,
    animationListener: Animation.AnimationListener? = null
) {
    val scaleAnimation = ScaleAnimation(1f, 1f, 0f, 1f)
    scaleAnimation.interpolator = BounceInterpolator()
    scaleAnimation.duration = duration
    scaleAnimation.fillAfter = fillAfter
    scaleAnimation.setAnimationListener(animationListener)
    startAnimation(scaleAnimation)
}

/**
 * View Extension To Add Pulse Animation To Your Views
 * @author Norman Jay Palisoc
 * @param duration the duration of animation
 */
fun View.addPulseAnimation(duration: Long) {
    val scaleDown: ObjectAnimator = ObjectAnimator.ofPropertyValuesHolder(
        this,
        PropertyValuesHolder.ofFloat("scaleX", 1.2f),
        PropertyValuesHolder.ofFloat("scaleY", 1.2f)
    )
    scaleDown.duration = duration
    scaleDown.repeatCount = ObjectAnimator.INFINITE
    scaleDown.repeatMode = ObjectAnimator.REVERSE
    scaleDown.start()
}

/**
 * View Extension To Add Fade Out Animation To Your Views
 * @author Norman Jay Palisoc
 * @param duration the duration of animation
 * @param fillAfter by default (true), tells if the animated view will stay in its animated position
 * @param animationListener by default (null), to monitor the animation by way of its listener in your own implementation
 */
fun View.addFadeInAnimation(
    duration: Long, fillAfter: Boolean = true,
    animationListener: Animation.AnimationListener? = null
) {
    val fadeIn = AlphaAnimation(0f, 1f)
    fadeIn.interpolator = DecelerateInterpolator()
    fadeIn.duration = duration
    fadeIn.fillAfter = fillAfter
    fadeIn.setAnimationListener(animationListener)
    startAnimation(fadeIn)
}

/**
 * View Extension To Add Fade Out Animation To Your Views
 * @author Norman Jay Palisoc
 * @param duration the duration of animation
 * @param fillAfter by default (true), tells if the animated view will stay in its animated position
 * @param animationListener by default (null), to monitor the animation by way of its listener in your own implementation
 */
fun View.addFadeOutAnimation(
    duration: Long, fillAfter: Boolean = true,
    animationListener: Animation.AnimationListener? = null
) {
    val fadeIn = AlphaAnimation(1f, 0f)
    fadeIn.interpolator = DecelerateInterpolator()
    fadeIn.duration = duration
    fadeIn.fillAfter = fillAfter
    fadeIn.setAnimationListener(animationListener)
    startAnimation(fadeIn)
}

/**
 * View Extension To Add Translate Animation To Your Views
 * @author Norman Jay Palisoc
 * @param duration the duration of animation
 * @param fromX the initial starting X-Axis point (in Float) where the animation will start
 * @param toX the ending X-Axis point (in Float) where the animation will end
 * @param fromY the initial starting Y-Axis point (in Float) where the animation will start
 * @param toY the ending Y-Axis point (in Float) where the animation will end
 * @param fillAfter by default (true), tells if the animated view will stay in its animated position
 * @param animationListener by default (null), to monitor the animation by way of its listener in your own implementation
 */
fun View.addTranslateAnimation(
    duration: Long, fromX: Float, toX: Float, fromY: Float, toY: Float,
    fillAfter: Boolean = true, animationListener: Animation.AnimationListener? = null
) {
    val translateAnimation = TranslateAnimation(fromX, toX, fromY, toY)
    translateAnimation.duration = duration
    translateAnimation.fillAfter = fillAfter
    translateAnimation.setAnimationListener(animationListener)
    startAnimation(translateAnimation)
}

/**
 * View Extension To Add Rotation Animation To Your Views
 * @author Norman Jay Palisoc
 * @param duration the duration of Rotating the View
 * @param fillAfter by default (true), tells if the animated view will stay in its animated position
 * @param repeatCount sets how many times the view will be animated, 0 by default, -1 to infinite
 * @param fromDegrees the degrees (in float) on where to start the rotation (0 - 360)
 * @param toDegrees the degrees (in float) on where to end the rotation (0 - 360)
 * @param animationListener by default (null), to monitor the animation by way of its listener in your own implementation
 */
fun View.addRotateAnimation(
    duration: Long,
    fillAfter: Boolean = true,
    repeatCount: Int = 0,
    fromDegrees: Float,
    toDegrees: Float,
    animationListener: Animation.AnimationListener? = null
) {
    val rotateAnimation = RotateAnimation(
        fromDegrees, toDegrees,
        Animation.RELATIVE_TO_SELF, 0.5f,
        Animation.RELATIVE_TO_SELF, 0.5f
    )
    rotateAnimation.duration = duration
    rotateAnimation.fillAfter = fillAfter
    rotateAnimation.repeatCount = repeatCount
    rotateAnimation.setAnimationListener(animationListener)
    startAnimation(rotateAnimation)
}

/**
 * View Extension To Add Scale In Animation To Your Views
 * @author Norman Jay Palisoc
 * @param duration the duration of Scaling In the View
 * @param fillAfter by default (true), tells if the animated view will stay in its animated position
 * @param repeatCount sets how many times the view will be animated, 0 by default, -1 to infinite
 * @param animationListener by default (null), to monitor the animation by way of its listener in your own implementation
 */
fun View.addScaleInAnimation(
    duration: Long,
    fillAfter: Boolean = true,
    repeatCount: Int = 0,
    animationListener: Animation.AnimationListener? = null
) {
    val scaleAnimation = ScaleAnimation(
        0f, 1f,
        0f, 1f,
        Animation.RELATIVE_TO_SELF, 0.5f,
        Animation.RELATIVE_TO_SELF, 0.5f
    )
    scaleAnimation.duration = duration
    scaleAnimation.fillAfter = fillAfter
    scaleAnimation.repeatCount = repeatCount
    scaleAnimation.setAnimationListener(animationListener)
    startAnimation(scaleAnimation)
}

/**
 * View Extension To Add Scale Out Animation To Your Views
 * @author Norman Jay Palisoc
 * @param duration the duration of Scaling Out the View
 * @param fillAfter by default (true), tells if the animated view will stay in its animated position
 * @param repeatCount sets how many times the view will be animated, 0 by default, -1 to infinite
 * @param animationListener by default (null), to monitor the animation by way of its listener in your own implementation
 */
fun View.addScaleOutAnimation(
    duration: Long,
    fillAfter: Boolean = true,
    repeatCount: Int = 0,
    animationListener: Animation.AnimationListener? = null
) {
    val scaleAnimation = ScaleAnimation(
        1f, 0f,
        1f, 0f,
        Animation.RELATIVE_TO_SELF, 0.5f,
        Animation.RELATIVE_TO_SELF, 0.5f
    )
    scaleAnimation.duration = duration
    scaleAnimation.fillAfter = fillAfter
    scaleAnimation.repeatCount = repeatCount
    scaleAnimation.setAnimationListener(animationListener)
    startAnimation(scaleAnimation)
}

/**
 * View Extension To Flip Your Views
 * @author Norman Jay Palisoc
 * @param durationFrom the first duration in flipping the View, if not set, the default is 300ms
 * @param durationTo the second duration after the initial flip of the View, if not set, the default is 300ms
 */
fun View.addFlipAnimation(durationFrom: Long = 300, durationTo: Long = 300) {
    val oa1 = ObjectAnimator.ofFloat(this, "scaleX", 1f, 0f)
    val oa2 = ObjectAnimator.ofFloat(this, "scaleX", 0f, 1f)
    oa1.interpolator = DecelerateInterpolator()
    oa2.interpolator = AccelerateDecelerateInterpolator()
    oa1.duration = durationFrom
    oa2.duration = durationTo
    oa1.addListener(object : AnimatorListenerAdapter() {
        override fun onAnimationEnd(animation: Animator) {
            super.onAnimationEnd(animation)
            oa2.start()
        }
    })
    oa1.start()
}

/**
 * ImageView Extension To Flip You Image And Change The Initial Image After Flipped
 * @author Norman Jay Palisoc
 * @param imageResource The image resource that will be used to replace the initial image after flipped
 * @param durationFrom the first duration in flipping the View, if not set, the default is 300ms
 * @param durationTo the second duration after the initial flip of the View, if not set, the default is 300ms
 */
fun ImageView.addFlipAnimationChangeImage(
    @DrawableRes imageResource: Int,
    durationFrom: Long = 300, durationTo: Long = 300
) {
    val oa1 = ObjectAnimator.ofFloat(this, "scaleX", 1f, 0f)
    val oa2 = ObjectAnimator.ofFloat(this, "scaleX", 0f, 1f)
    oa1.interpolator = DecelerateInterpolator()
    oa2.interpolator = AccelerateDecelerateInterpolator()
    oa1.duration = durationFrom
    oa2.duration = durationTo
    oa1.addListener(object : AnimatorListenerAdapter() {
        override fun onAnimationEnd(animation: Animator) {
            super.onAnimationEnd(animation)
            this@addFlipAnimationChangeImage.setImageResource(imageResource)
            oa2.start()
        }
    })
    oa1.start()
}

/**
 * ImageView Extension To Flip You Image And Change The Initial Image After Flipped
 * @author Norman Jay Palisoc
 * @param drawable The image drawable that will be used to replace the initial image after flipped
 * @param durationFrom the first duration in flipping the View, if not set, the default is 300ms
 * @param durationTo the second duration after the initial flip of the View, if not set, the default is 300ms
 */
fun ImageView.addFlipAnimationChangeImage(
    drawable: Drawable,
    durationFrom: Long = 300,
    durationTo: Long = 300
) {
    val oa1 = ObjectAnimator.ofFloat(this, "scaleX", 1f, 0f)
    val oa2 = ObjectAnimator.ofFloat(this, "scaleX", 0f, 1f)
    oa1.interpolator = DecelerateInterpolator()
    oa2.interpolator = AccelerateDecelerateInterpolator()
    oa1.duration = durationFrom
    oa2.duration = durationTo
    oa1.addListener(object : AnimatorListenerAdapter() {
        override fun onAnimationEnd(animation: Animator) {
            super.onAnimationEnd(animation)
            this@addFlipAnimationChangeImage.setImageDrawable(drawable)
            oa2.start()
        }
    })
    oa1.start()
}

/**
 * ImageView Extension To Flip You Image And Change The Initial Image After Flipped
 * @author Norman Jay Palisoc
 * @param bitmap The image bitmap that will be used to replace the initial image after flipped
 * @param durationFrom the first duration in flipping the View, if not set, the default is 300ms
 * @param durationTo the second duration after the initial flip of the View, if not set, the default is 300ms
 */
fun ImageView.addFlipAnimationChangeImage(
    bitmap: Bitmap,
    durationFrom: Long = 300,
    durationTo: Long = 300
) {
    val oa1 = ObjectAnimator.ofFloat(this, "scaleX", 1f, 0f)
    val oa2 = ObjectAnimator.ofFloat(this, "scaleX", 0f, 1f)
    oa1.interpolator = DecelerateInterpolator()
    oa2.interpolator = AccelerateDecelerateInterpolator()
    oa1.duration = durationFrom
    oa2.duration = durationTo
    oa1.addListener(object : AnimatorListenerAdapter() {
        override fun onAnimationEnd(animation: Animator) {
            super.onAnimationEnd(animation)
            this@addFlipAnimationChangeImage.setImageBitmap(bitmap)
            oa2.start()
        }
    })
    oa1.start()
}

/**
 * ImageView Extension To Flip You Image And Change The Initial Image After Flipped
 * @author Norman Jay Palisoc
 * @param uri The image URI (android.net.Uri) that will be used to replace the initial image after flipped
 * @param durationFrom the first duration in flipping the View, if not set, the default is 300ms
 * @param durationTo the second duration after the initial flip of the View, if not set, the default is 300ms
 */
fun ImageView.addFlipAnimationChangeImage(
    uri: android.net.Uri,
    durationFrom: Long = 300,
    durationTo: Long = 300
) {
    val oa1 = ObjectAnimator.ofFloat(this, "scaleX", 1f, 0f)
    val oa2 = ObjectAnimator.ofFloat(this, "scaleX", 0f, 1f)
    oa1.interpolator = DecelerateInterpolator()
    oa2.interpolator = AccelerateDecelerateInterpolator()
    oa1.duration = durationFrom
    oa2.duration = durationTo
    oa1.addListener(object : AnimatorListenerAdapter() {
        override fun onAnimationEnd(animation: Animator) {
            super.onAnimationEnd(animation)
            this@addFlipAnimationChangeImage.setImageURI(uri)
            oa2.start()
        }
    })
    oa1.start()
}

/**
 * ImageView Extension To Flip You Image And Change The Initial Image After Flipped
 * @author Norman Jay Palisoc
 * @param icon an Icon that will be used to replace the initial image after flipped
 * @param durationFrom the first duration in flipping the View, if not set, the default is 300ms
 * @param durationTo the second duration after the initial flip of the View, if not set, the default is 300ms
 */
fun ImageView.addFlipAnimationChangeImage(
    icon: Icon,
    durationFrom: Long = 300,
    durationTo: Long = 300
) {
    val oa1 = ObjectAnimator.ofFloat(this, "scaleX", 1f, 0f)
    val oa2 = ObjectAnimator.ofFloat(this, "scaleX", 0f, 1f)
    oa1.interpolator = DecelerateInterpolator()
    oa2.interpolator = AccelerateDecelerateInterpolator()
    oa1.duration = durationFrom
    oa2.duration = durationTo
    oa1.addListener(object : AnimatorListenerAdapter() {
        override fun onAnimationEnd(animation: Animator) {
            super.onAnimationEnd(animation)
            this@addFlipAnimationChangeImage.setImageIcon(icon)
            oa2.start()
        }
    })
    oa1.start()
}
