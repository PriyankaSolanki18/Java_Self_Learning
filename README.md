# Java_Self_Learning
Core Java

Exception Hierarchy in Java according to calsses :-

               Object
                 |
             Throwable
                 |
      -----------------------------------
      |                                  |
    Error                            Exception
    (Error can                       (can and 
    be handled,                      should be
    it simply                        handled)
    stops the                            |
    execution)                        -----------------------------------------------
    (Eg. ThreadDeath,                 |                       |                     |
    IOError,                      Runtime                     IO                   SQL
    VirtualMachineError           Exception                Exception             Exception
    -Out                       (Eg. Arithmatic            [Checked               [Checked
    of memory)                   Exception,                Exception]            Exception]
                            ArrayIndexOutOfBound
                                Exception, 
                                NullPointer
                                Exception)
                            [Called Unchecked
                                Exception]

