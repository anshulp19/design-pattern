observer pattern defines a one-to-many dependency between objects so that when one object changes state, 
all its dependents are notified and updated automatically. It is also referred to as the publish-subscribe pattern.

The observer pattern has four participants.

Subject – interface or abstract class defining the operations for attaching and de-attaching observers to the subject.
ConcreteSubject – concrete Subject class. It maintain the state of the object and when a change in the state occurs it notifies the attached Observers.
Observer – interface or abstract class defining the operations to be used to notify this object.
ConcreteObserver – concrete Observer implementations.

