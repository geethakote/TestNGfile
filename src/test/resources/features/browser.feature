Feature: cross browser

  Scenario Outline: open a browser for given vertion
    Given open "<bn>" browser which version is "<v>"

    Examples: 
      | bn      | v             |
      | chrome  | 96.0.4664.110 |
      | firefox | 95.0.2        |
      | edge    | 96.0.1054.62  |
