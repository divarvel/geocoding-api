Google Geocoding API Helper
===========================

Easy-Breezy helper to talk to the Google Maps geocoding API

    scala > val places = Geocoding.encodeAddress("17 rue Lanoue Bras de Fer, Nantes")
    scala > places.results map { _.formatted_address }

Just look at `Types.scala` to see what's returned.

