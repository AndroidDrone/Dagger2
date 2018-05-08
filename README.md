# Dagger2
Introduction about Dagger2

A fast dependency injector for Android and Java.

Following are the basic annotations used in Dagger 2:

@Module : This is used on the class that does the work of constructing objects that’ll be eventually provided as dependencies.

@Provide : This is used on the methods inside the Module class that’ll return the object.

@Inject : This is used upon a constructor, field or a method and indicates that dependency has been requested.

@Component : The Module class doesn’t provide the dependency directly to the class that’s requesting it. For this a Component interface is used that acts like a bridge between @Module and @Inject.

@Singleton : This indicates that only a single instance of the dependency object would be created.
