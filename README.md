Association
Association

Aggregation and Composition are subsets of association meaning they are specific cases of association.

Aggregation
Aggregation is a specialized form of Association where all objects have their own life cycle, where the child can exist independently of the parent. Aggregation is also called a “Has-a” relationship.

Let's take an example of Supervisor and Subordinate. An employee (as a subordinate) can not belong to multiple supervisors, but if we delete the supervisor, the employee object (subordinate) will not be destroyed. We can think about it as a “has-a” relationship.#ASSOCIATION
Association is a relationship between two separate classes that establishes through their objects. Each objects have their own life-cycle and there is no owner. Association can be one-to-one, one-to-many, many-to-one, many-to-many.
Let's take an example of Teacher and Student. Multiple students can associate with single teacher and single student can associate with multiple teachers, but there is no ownership between the objects and both have their own life-cycle. Both can be created and deleted independently.
Composition

