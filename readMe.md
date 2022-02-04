## Clean Architecture - seperation of concern

“Clean code always looks like it was written by someone who cares.”

The goal of software architecture is to minimize the human resources required to build and maintain the required system

Yes, but I already have my MVVM architecture in my app, why should I bother?


Well, probably if you are working on a simple project Clean Architecture might seem overkill, but what if you need to decouple modules, testing the modules in isolation, and helping your team to work on separated code containers? Clean Architecture helps developers to avoid spelunking through the software code trying to figure out functionalities and business logic.

Probably you’ve seen this layer diagram a lot of times, in my case, it didn’t help very much to understand how to convert these layers in an organized android project, but let’s stay on theory and definitions for the moment.
Entities: encapsulate enterprise-wide critical business rules. An entity can be an object with methods or a set of data structures and functions
Use cases: orchestrate the flow of data to and from the entities
Controllers, Gateways, Presenters: a set of adapters that convert data from the use cases and entities format to a most convenient way, in order to pass the data to the upper level (typically the UI)
UI, External Interfaces, DB, Web, Devices: the outermost layer of the architecture, generally composed of frameworks such as database and web frameworks.
The dependencies between the layers must be inwards, a lower-level module should not depend on a higher level module (entities should not depend on use cases, use cases should not depend on controllers and so on, take a look at the direction of the arrows in the diagram).

Why MVVM with Clean Architecture?
MVVM separates your view (i.e. Activitys and Fragments) from your business logic. MVVM is enough for small projects, but when your codebase becomes huge, your ViewModels start bloating. Separating responsibilities becomes hard.

MVVM with Clean Architecture is pretty good in such cases. It goes one step further in separating the responsibilities of your code base. It clearly abstracts the logic of the actions that can be performed in your app.


Advantages of Using Clean Architecture
Your code is even more easily testable than with plain MVVM.
Your code is further decoupled (the biggest advantage.)
The package structure is even easier to navigate.
The project is even easier to maintain.
Your team can add new features even more quickly.

Disadvantages of Clean Architecture
It has a slightly steep learning curve. How all the layers work together may take some time to understand, especially if you are coming from patterns like simple MVVM or MVP.
It adds a lot of extra classes, so it’s not ideal for low-complexity projects.

The Layers of MVVM with Clean Architecture
The code is divided into three separate layers:

Why the cleaner approach?

Separation of code in different layers with assigned responsibilities making it easier for further modification.
High level of abstraction
Loose coupling between the code
Testing of code is painless

Presentation Layer
Domain Layer
Data Layer


Domain (Kotlin Library)
Data 
presentation layer


domain packages: exception, executor , interactor, model, repository, util

data packages : cache, entity, events, exception, executor, mapper, network, repository

domain in data 
domain and data in app 



Mvvm is architecture design pattern that helps structure our project  and scale our code 

Clean architecture can i extends this includes a addition layer in mvvm  - model view viewmodel and clean architecture having one more layer is usecase layer contains
our business logic once project getting bigger we have to user guard viewmodel 


What is the usecase ? 
Kind of part of the feature of your app 

A features a set of streams together - profile feature & edit profile screen - usecase - getuserprofile and updateProfileData additional layer if we seperate 
this a usecase we can use same functionality in different viewmodel


one usecase we can use in mutiple viewmodel and we can reuse it removes code duplication

1. streaming architecture - means easy to understand the product about because what we will see is package for usecases (feature profile that contain related to feature usecases)
2. code duplication 

No need to open class and need to see what present inside actually 


In isolation 

presentation - ui (view and viewmodels)

domain layer - model , entities, interface for repository , usecases 

data layer - api interface , room database, repository 



Difference between the repo in domain and repo in data layer 

In domain layer we only define our interface of repo and override in data layer 

dto - is data transfer object basically abstract that api returns 

we need lider models comes into domain layer models we show to ui 



Application architecture defines the way we develop, test, scale and maintain our application. Good architecture allows you to easily adopt to constantly changing requirements and protects you from breaking existing functionalities. 

Generally in Clean, code is separated into layers in an onion shape with one dependency rule: The inner layers should not know anything about the outer layers. Meaning that the dependencies should point inwards.



Outer: Implementation layer
Middle: Interface adapter layer
Inner: Business logic layer
The implementation layer is where everything framework specific happens. Framework specific code includes every line of code that is not solving the problem you set to solve, this includes all Android stuff like creating activities and fragments, sending intents, and other framework code like networking code and databases.
The purpose of the interface adapter layer is to act as a connector between your business logic and framework specific code.
The most important layer is the business logic layer. This is where you actually solve the problem you want to solve building your app. This layer does not contain any framework specific code and you should be able to run it without an emulator. This way you can have your business logic code that is easy to test, develop and maintain. That is the main benefit of the Clean Architecture.





SOLID Principles
Five design principles make software design more understandable, flexible and maintainable. Those principles are:
* 		Single Responsibility: Each software component should have only one reason to change – one responsibility.
* 		Open-closed: You should be able to extend the behavior of a component, without breaking its usage, or modifying its extensions.
* 		Liskov Substitution: If you have a class of one type, and any subclasses of that class, you should be able to represent the base class usage with the subclass, without breaking the app.
* 		Interface Segregation: It’s better to have many smaller interfaces than a large one, to prevent the class from implementing the methods that it doesn’t need.
* 		Dependency Inversion: Components should depend on abstractions rather than concrete implementations. Also higher level modules shouldn’t depend on lower level modules.


Layers of Clean Architecture
There are different opinions about how many layers Clean Architecture should have. The architecture doesn’t define exact layers but instead lays out the foundation. The idea is that you adapt the number of layers to your needs.
To keep things simple, you’ll use five layers:
* 		Presentation: A layer that interacts with the UI.
* 		Use cases: Sometimes called interactors. Defines actions the user can trigger.
* 		Domain: Contains the business logic of the app.
* 		Data: Abstract definition of all the data sources.
* 		Framework: Implements interaction with the Android SDK and provides concrete implementations for the data layer.



Local Development
Here are some useful Gradle/adb commands for executing this example:

./gradlew clean build - Build the entire example and execute unit and integration tests plus lint check.
./gradlew installDebug - Install the debug apk on the current connected device.
./gradlew runUnitTests - Execute domain and data layer tests (both unit and integration).
./gradlew runAcceptanceTests - Execute espresso and instrumentation acceptance tests.





Notification - module 80k

# Requirements
1. Splash Screen
2. Intro screen for 3 slide slide carousel - ignore 
3. Home Screen with Navigation Component 
4. Slide View carousel with image timer - ingore 
5. RecyclerView Dynamic Module Add  - ImageView, Name and Offer  - Ex:- mutton egg chicken
   
Home module 
Location search add address - api 
 grid view with card item contains image , Text -> if we click each item it will navigate to details screen 
-> In Details screen contain all list of item related to category , Tool bar search option , Image, Text , description , Add to card (or) + 1 - 


6. Ad banner below in home screen - ignore 
7. bottom navigation - Home , Cart , Order
   
8. Icon for Account - to see Payment history and location choose and based on location 
   we cant show app to proceed to order any food


Same Login -> owner, delivery, user
1. delivery boy login  - List of order requested (current month) - Pending state, Processing State, Done state -  click and update delivery status based on location


Admin Login -
1. All features of delivery boy with filter all month data
2. Add module for delivery boy and delete and update delivery boy details.
3. Add Category List of Menu update image and name.
4. Add List of items in Menu update items add image price ,discount, quantity
5. App config for disable app immediately. and timing to deliver

Payment Gateway RazorPay implementation for user 

