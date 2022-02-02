Feature: User should be able to perform operations

  Scenario: User should be able to perform add operations
    Given user has access to calculator
    When add 5 and 6
    Then verify addition of two numbers in calculator is 11

  Scenario: User should be able to perform substract operations
    Given user has access to calculator
    When substract 7 and 2
    Then verify addition of two numbers in calculator is 5

  Scenario Outline: User should be able to perform all operations
    Given user has access to calculator
    When <operation> <firstOperand> and <secondOperand>
    Then verify addition of two numbers in calculator is <result>
    Examples:
      | Scenario                   | operation | firstOperand | secondOperand | result |
      | Verify add operation       | add       | 6            | 11            | 17     |
      | Verify substract operation | substract | 8            | 1             | 7      |
#      | Verify multiply operation  | multiply  | 3            | 4             | 12     |
#      | Verify divide operation    | divide    | 25           | 5             | 5      |