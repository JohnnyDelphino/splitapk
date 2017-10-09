# splitapk

splits.abi<>productFlavors

e...@google.com  <je...@google.com>  #5 Aug 29, 2017 01:30AM 

Status: Won't Fix (Intended Behavior)
ah yes welcome to Groovy ! so splits is defined at the AndroidConfig level not at the ProductFlavor level.

see https://google.github.io/android-gradle-dsl/current/com.android.build.gradle.AppExtension.html

however, the closures in groovy will walk up the chain of receiver to apply an Action on and it finds AppExtension as a grand parent, and apply your "splits" settings globally.

so to make story short, splits is not per flavors and yes this is uber confusing that no error is generated due to the wrong placement of the your "split" block. 
 
we will be looking at locking this down in 3.1 so a meaning full error message can be displayed.

> https://issuetracker.google.com/issues/37052384