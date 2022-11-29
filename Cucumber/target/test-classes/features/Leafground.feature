@multiwindow
Feature: To Perfrom selenium actions
  

  @tag1
  Scenario: To select Multiple windows in leaf ground 
    Given Go to Leaf ground page
		When window was selected from browser menu
		And press open button in Click and Confirm new Window
		Then other page is opens
		And while clicking setting layoutmenu was displayed
   
    