# Java Hidden Facts

## Variable name

- The exact limit to a variable name that you can hae in Java is: **65,535** characters.
- (Limitation of JVM) The length of field and method names, field and method descriptors, and other constant string values is limited to **65,535** characters by the 16-bit unsigned length item of the CONSTANT_Utf8_info structure.
- The CONSTANT_Utf8_info structure is crucial for storing various string-based information within a class file, including:
  - Class, field, and method names.
  - Type descriptors.
  - String literals.
  - Source file names.
  - Attribute names (e.g., "Code", "Signature").
