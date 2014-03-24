# Shopping Cart Dojo

Thanks to Benjamin Benni who logged the test cases during the session.

## TODOs
  - Add exception throwing mechanisms

## Tests

### Tests ADD:

 - add items with a quantity lesser than 0
 - add a normal item, assess the quantity
 - add the same item twice, should increase the quantity
 - add 30,000 items 
 - successive adds
 - heavy successive adds (30,000 successive calls)
 
### Tests DELETE:
  - delete a non-existing item
  - ~~delete an item more than what is insisde the cart~~
  - delete a quantity lesser than 0
  - delete the same item twice, should decrease the quantity
  - delete an item on the empty cart
  

### Tests GET
  - get an non-existing item
  - get the null object
  - get an item on the empty cart

### Tests SIZE
    - ~~size(empty) must be equals to zero~~
    - ~~size must change w.r.t. adds and deletions~~
    - check the size whan adds or deletions trigger errors
