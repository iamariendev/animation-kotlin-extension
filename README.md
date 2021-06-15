# Kotlin Extension For Animations
Android Animations using Kotlin Extension (Easily add animations to your views just like adding them as extensions in kotlin). We often used custom animation resources or create our own animations using the default android animations, in this library, it combined them all and made them as simple as extension to your views so you can easily add animations to any of your views (e.g. images, buttons, input fields, cardviews etc.) in one single line of code. You can also override their default animation listeners so you can pretty track how the animation goes (e.g. onStart, onEnd, onRepeatCount).

# How to add to your Android Project
<b>Step 1</b>. Add the JitPack repository to your build.gradle file (Project Level Gradle).
```java
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
  }
}
```
<b>Step 2</b>. Add the Dependency.
```java
dependencies {
  implementation 'com.github.iamariendev:animation-kotlin-extension:1.1'
}
```
# Library Usage
You can use the animations just as adding them as extension to your views. Works only in Kotlin.
```kotlin
// Adding Scale In Animation
binding.imageView.addScaleInAnimation(duration = 900)

// Adding Scale Out Animation
binding.imageView.addScaleOutAnimation(duration = 900)

// Adding Rotation Animation
binding.imageView.addRotateAnimation(duration = 900, fromDegrees = 0f, toDegrees = 360f)

// You can also override the animation's animation listener to further monitor how the animation goes
binding.imageView.addPushDownOutAnimation(context = it.context, duration = 900,
  animationListener = object : Animation.AnimationListener {
    override fun onAnimationStart(animation: Animation?) {
      // Animation Started
    }
    override fun onAnimationEnd(animation: Animation?) {
      // Animation Ended
    }
    override fun onAnimationRepeat(animation: Animation?) {
      // Animation Repeated
    }
})

// You can also set if the view will stay still in its animation position with the use of fillAfter
binding.imageView.addShrinkAndRotateAnimation(context = applicationContext, duration = 900, fillAfter = true)
```
# List of available Animations

```python
- addScaleInAnimation()
- addScaleOutAnimation()
- addPushLeftInAnimation()
- addPushLeftOutAnimation()
- addPushRightInAnimation()
- addPushRightOutAnimation()
- addSlideUpAnimation()
- addSlideDownAnimation()
- addRotateAnimation()
- addBounceAnimation()
- addPushDownInAnimation()
- addPushUpInAnimation()
- addPushUpOutAnimation()
- addPulseAnimation()
- addFadeInAnimation()
- addFadeOutAnimation()
- addShrinkAndRotateAnimation()
- addFlipAnimation()
- addFlipAnimationChangeImage()
- addTranslateAnimation()
- addBlinkAnimation()
- addShakeAnimation()
```
You can simply add these extension functions to add animations to your views.
