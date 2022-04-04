## Memory

* Two types of computer memory
  * Primary memory (RAM and ROM)
    * Random Access Memory (RAM) is primary volatile memory
    * Read-Only Memory (ROM) is primary non-volatile memory
  * Secondary memory (hard drive, CD, etc.)

### Random Access Memory (RAM)

* Also called **read-write memory**, **main memory**, or **the primary memory**
* **Volatile memory** means that the data is lost when the power is turned off
* Two types of RAM
  * SRAM (Static Random Access Memory)
    * Circuits similar to D flip-flops
    * Holds its contents as long as power is available
    * Expensive
    * Faster than DRAM
    * Can not store many bits per chip
    * Generates more heat
    * Used for cache
  * DRAM (Dynamic Random Access Memory)
    * Made of tiny capacitors
    * Required a recharge every few milliseconds to maintain its data
    * Inexpensive
    * Slower than SRAM
    * Can store many bits per chip
    * Uses less power
    * Generates less heat
    * Used for main memory

### Read-Only Memory (ROM)

* Stores crucial information essential to operate the system, like the BIOS
* Always retains its data
* Used where the programming needs no change or in embedded systems
* Used in calculators and peripheral devices
* Types of ROM (Read-Only Memory)
  * PROM (Programmable read-only memory) can be programmed by the user; the data and instructions in it cannot be changed
  * EPROM (Erasable Programmable read-only memory) can be reprogrammed; to erase data from it, expose it to ultraviolet light; to reprogram it, erase all the previous data
  * EEPROM (Electrally erasable programmable read-only memory) can be erased by applying an electric field; only portions of the chip can be erased
  * MROM (Mask ROM) is a kind of ROM that is masked off at the time of production; MROM cannot enable the user to change the data stored in it; the process would be difficult or slow, even if possible
  
| RAM                       | ROM                                  |
|---------------------------|--------------------------------------|
| Temporary storage         | Permanent storage                    |
| Store data in MBs         | Store data in GBs                    |
| Volatile                  | Non-volatile                         |
| Used in normal operations | Used for computer start-up processes |
| Writing data is faster    | Writing data is slower               |

### Environmental Variables

* An **environmental variable** is a dynamic valuethat the operating system and other software can use to determine information specific to your computer.
* Something that represents something else, like a location on your computer, a version number, a list of objects, etc.
* Environmental variables are surrounded by the percent sign (%), as in %temp%, to distinguish them from regular text.
* Two types of environmental variables
  * User environmental variables
  * System environmental variables

### Operating System Fundamentals

* An **operating system (OS)** is an interface between a computer user and computer hardware.
* Important functions of an OS
  * Memory management
  * Processor management
  * Device management
  * File management
  * Security
  * Control over system performance
  * Job accounting
  * Error detecting aids
  * Coordination between other software and users
* Important applications of an OS
  * **Security:** By means of password and similar other techniques, prevents authorized access to programs and data
  * **Control over system performance:** Recording delays between request for a service and response from the system
  * **Job accounting:** Keeping track of time and resources used by various jobs and users
  * **Error detecting aids:** Production of dumps, traces, error messages, and other debugging and error detecting aids
  * **Coordination between other pieces of software and user:** Coordination and assignment of compilers, interpreters, assemblers, and other software to the various users of the computer systems