Feature:  General Store

  Scenario: TC02 | Negatif Test
When Ulke menusunden "Belarus" secilir
    And İsim kutusu bos birakilir
    And Cinsiyet seceneklerinden "female" secilir
    And Lets Shop butonuna tiklanir
    And Hata mesajinin "Please enter your name" oldugu dogrulanir