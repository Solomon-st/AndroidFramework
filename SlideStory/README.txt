Software introduction:
This is a software allows you slide to share your objects to nearby devices thru wifi-direct.
1) You should open the software and it will recognize devices which are also opening this software nearby.
2) It can feel the devices' direction, and show some arrow on your device.
3) You can slide a file or another object to share the object with target device.



********************************************************************
Design document:

There are 3 main objects in this software.
1) Main screen.
2) Target. Which stands for a device.
3) Item. Which stands for a file.

Main screen:
1) There is a menu let us can choose an Item.
2) After choose an Item, it shows a sprite on the screen let you can drag and throw to Targets.
3) At the edge of the screen, there are some arrows which are stands for some nearby Targets.

Target:
1) Which stands as a device, so should hold a Device as its main property.
2) Contains a View to show its arrow icon.

Item:
1) Which stands as a file, so should hold a File as it's main property.
2) An Item is a sprite can drag to move it on the screen, and can throw it to the target either. So a sprite should be contained.