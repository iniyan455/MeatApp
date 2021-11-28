## Clean Architecture - seperation of concern


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
