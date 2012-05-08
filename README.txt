The source code for the jai-imageio-core project is copyrighted code that
is licensed to individuals or companies who download or otherwise
access the code.

The copyright notice for this project is in COPYRIGHT.txt

The source code license for this project is in LICENSE.txt

Standalone modifications
------------------------

NOTE:

This is a 'standalone' version of jai-imageio-core where dependencies
to jai-core (javax.media.jai) has been removed. This version also 
does not include any of the C implementations from libJIIO, meaning
that this version is fully redistributable under the modified
BSD license in LICENSE.txt.

Modifications (c) Stian Soiland-Reyes <stian@soiland-reyes.com> 2010-04-30


How to build
------------
1. Download or clone repository :
     git clone git://github.com/davenatx/jai-imageio-core.git

2. Open a shell in the project's root directory, and launch SBT.
   
3. Type 'publish-local' to publish the artifacts to your local ivy repo.

More info
---------
http://java.net/projects/jai-imageio-core
