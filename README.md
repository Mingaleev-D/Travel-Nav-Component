# Travel APP | Путешествие

### Мингалеев Динар | Mingaleev Dinar
> Mingaleev-D92

## Description | Описание

+ Это очень маленький пример приложения, которое я создал, для того чтобы разобраться в компонентах навигации

 ++ This is a very small example of an application that I created in order to understand navigation components.


![Travel](https://user-images.githubusercontent.com/61611031/165486434-8542fa62-4df6-40c2-af58-8c530a822687.gif)

## Stack | Технологии

 + ConstraintLayout
 + Picasso
 + RecyclerView
 + Moshi

## Architecture | Архитектура

 + MVVM

## Dependency | Зависимость

```kotlin

 // Navigation Components
     def nav_version = "2.3.3"
     implementation "androidx.navigation:navigation-fragment-ktx:$nav_version"
     implementation "androidx.navigation:navigation-ui-ktx:$nav_version"

     // Picasso
     implementation 'com.squareup.picasso:picasso:2.71828'

     // Moshi
     implementation 'com.squareup.moshi:moshi-kotlin:1.12.0'

     // Epoxy
     def epoxyVersion = "4.4.1"
     implementation "com.airbnb.android:epoxy:$epoxyVersion"
     kapt("com.airbnb.android:epoxy-processor:$epoxyVersion")

     // Scrolling Page Indicator
     implementation "ru.tinkoff.scrollingpagerindicator:scrollingpagerindicator:1.0.6"

```
