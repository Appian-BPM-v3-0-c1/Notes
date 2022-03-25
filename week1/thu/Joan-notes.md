###Review

* Methods are the behaviors of classes.
* Variable scopes are the space within which a variable can be called.
  * A parent cannot call a child's variables.
  * A child can access all of its parents' variables.

### Classes and Objects

* Classes are blueprints for objects.
* An object is an instantiation of a class.
* Encapsulation are access modifiers (e.g., public, private, protected).
  * We want encapsulation for security.
  * Allow certain classes to be accessed in a package.

|                                | default | private | protected | public |
|--------------------------------|---------|---------|-----------|--------|
| Same Class                     | Yes     | Yes     | Yes       | Yes    |
| Same package subclass          | Yes     | No      | Yes       | Yes    |
| Same package non-subclass      | Yes     | No      | Yes       | Yes    |
| Different package subclass     | No      | No      | Yes       | Yes    |
| Different package non-subclass | No      | No      | No        | Yes    |

