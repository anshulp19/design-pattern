The participants of iterator pattern are as follows:

Iterator: An interface to access or traverse the elements collection. Provide methods which concrete iterators must implement.

ConcreteIterator: implements the Iterator interface methods. It can also keep track of the current position in the traversal of the aggregate collection.

Aggregate: It is typically a collection interface which defines a method that can create an Iterator object.

ConcreteAggregate: It implements the Aggregate interface and its specific method returns an instance of ConcreteIterator.
