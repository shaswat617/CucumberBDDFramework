Feature: Watching movie feature
  Background:
    Given User has valid login credentials of NetFlix
    And User has NetFlix Subscription


  @Comedy
  Scenario: User wants to watch comedy movies
    When User adds comedy movies to WatchList
      |comedy movie 1|hero 1|heroine 1|side actor 1|
      |comedy movie 2|hero 2|heroine 2|side actor 2|
      |comedy movie 3|hero 3|heroine 3|side actor 3|
    Then User should be able to see Comedy in WatchList

  Scenario: User wants to watch patriotic movies
    When User adds patriotic movies to Watchlist
    |PatrioticMovie 1|PatrioticHero 1|PatrioticHeroine 1|PatrioticSideActor 1|
    |PatrioticMovie 2|PatrioticHero 2|PatrioticHeroine 2|PatrioticSideActor 2|
    |PatrioticMovie 3|PatrioticHero 3|PatrioticHeroine 3|PatrioticSideActor 3|
    Then User should be able to see Patriotic Movies in WatchList
