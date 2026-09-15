Feature: Caso de prueba POST

  Scenario: Caso de prueba POST positivo

    Given url 'https://serverest.dev/' + '/usuarios'
    And request
      """
      {
        "nome": "Tony Sonna",
        "email": "justin.qa212@test.com",
        "password": "teste",
        "administrador": "true"
      }
      """
    When method POST
    Then status 201
    And match response ==
      """
      {
        "message": "#string",
        "_id": "#string"
      }
      """

  Scenario: Caso de prueba POST negativo

    Given url 'https://serverest.dev/' + '/usuarios'
    And request
      """
      {
        "nome": "Jhosep Rico",
        "email": "justin.qa212@test.com",
        "password": "teste",
        "administrador": "true"
      }
      """
    When method POST
    Then status 400
    And match response ==
      """
      {
        "message": "#string"
      }
      """