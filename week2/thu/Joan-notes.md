###Generics

Generics allow us to simplify code.

A class is a blueprint. Classes require attributes and behaviors.

### How to Study

* Make a new project called "Example." Inside that project, make 10 classes.
* Write your classes out invidually. Delete what is present.
* Afterwards, initialize primitive data types within the classes.
* Practice each element of Java this way until you've got them down!

### Project 1

* Create your ogitwn repository on GitHug under Appian.
  * Call it "Joan-p1."
  * Make it public.
  * Add a README, add .gitignore (Java template), and choose the MIT license (for the lulz).
* Create folders:
  * main
    * java
    * resources
  * test
    * jave
    * resources
* Create a package such as "com.revature.[something]" (which looks like 3 folders: com > revature > [<]something]).
  * Under this, create the Main class.
  * Also here, create four packages.
      * ui, under which you'll create several classes and 1 interface.
        * IMenu (the interface)
        * MainMenu
        * [Something]Menu
        * ReviewMenu
      * models
      * services
      * daos
* MainMenu will start your application and use code such as the following (this is only an example):

```java
public class MainMenu implements IMenu {
    @Override
    public void start() {
        char input = ' ';
        Scanner scan = new Scanner(System.in);
        
        System.out.println("\nWelcome to restaurant review!");
        System.out.println("[1] View all restaurants");
        System.out.println("[2] Leave a review");
        System.out.println("[x] Exit");
        
        System.out.println("Enter: ");
        input = scan.next().charAt(0);
        
        switch (input) {
          case '1':
              new RestaurantMenu().start();
              break;
          case '2':
              break;
          case '3':
              break;
          case 'x': 
              exit = true;
              break;
          default:
              System.out.println("\nInvalid input!");
        }
    }
}
```

* Under models, you might include several models (in the form of classes), each of which 