# Final project : Trip planner

Trip planner is an app that allows users to create itineraries for day trips or outings, based on various features.

Time spent: **0** hours spent in total

## User Stories

The following **required** functionality is completed:

* [ ]   Design data model for users/itineraries/stops (2 day)
* [ ]   Preliminary UI design/colors

First time user registration: (1 day)
* [ ]   User can sign in through Google account
* [ ]   User can set preferences of activity types, transportation types, spending amount

Settings: (.5 day)
* [ ]   User can go to a settings page and update above preferences

List of Itineraries (maybe landing view for not-first time user) (3 days)
* [ ]	User can view a list of itineraries sorted by user's set preferences
* [ ]   User can sort list of itineraries based on location (nearby), highest rated, recommended, etc
* [ ]	User can search for an itinerary based on location or title keyword
* [ ]   User can filter down search based on other features (time requirement, activity requirements)

Detail view of Itinerary (7 days)
* [ ]   User can drill down into an itinerary in the list to view details
* [ ]   Detail view of itinerary includes a title, description, key features/attributes, photo
* [ ]   Detail view of itinerary includes a "timeline" view with specific places in chronological order
* [ ]   Each place "block" in the timeline view should show name, description, and other features
* [ ]   "Timeline" view includes blocks for travel time (map) between places
* [ ]   User can tap on travel block to open directions to next stop
* [ ]   User can rate an itinerary out of 5 stars

Create new Itinerary (7 days)
* [ ]   User can click a create button from actionbar to go to "Create Itinerary" activity
* [ ]   User can add a title, description, type, other features for the new itinerary
* [ ]   User can search in a searchbar (in a search "block") a place name and see top results from google places API
        -- fallback in case Google API fails, user inputs all details
* [ ]   User can select a place result and add to itinerary
* [ ]   Newly added place "block" becomes added to the itinerary and search block moves below to the bottom
* [ ]   User can save new itinerary to parse db
* [ ]   On save, user goes to itinerary detail view

Detail view of Stop (optional)

The following **optional** features are implemented:

* [ ]   Layout of detail view -- each place will have proportional height to the estimated length of time to spend
* [ ]   User can go to 'Explore', 'Favorites', and 'Visited' tabs for respective lists
* [ ]   User can mark an itinerary as 'Saved' or 'Visited' from list view or detail view
* [ ]   "Timeline" visual element
* [ ]   User can share a screenshot/image of the full itinerary with friends via share button
* [ ]   User can drill down into each stop block from "timeline view" of Itinerary to see description
* [ ]   User can rate a Stop out of 5 stars

The following **bonus** features are implemented:

* [ ]   User can make a reservation for a restaurant (uses OpenTable API)
* [ ]   User can create an event on google calendar and invite friends to do the itinerary (and/or email friends the screenshot/image)
* [ ]   User can drill down into each "Stop" block to see video, ratings, reviews

The following **additional** features are implemented:

* [ ] List anything else that you can get done to improve the app functionality!

## Video Walkthrough

Here's a walkthrough of implemented user stories:

<img src='http://i.imgur.com/link/to/your/gif/file.gif' title='Video Walkthrough' width='' alt='Video Walkthrough' />

GIF created with [LiceCap](http://www.cockos.com/licecap/).

## Notes

Describe any challenges encountered while building the app.

## Open-source libraries used

- [Android Async HTTP](https://github.com/loopj/android-async-http) - Simple asynchronous HTTP requests with JSON parsing
- [Picasso](http://square.github.io/picasso/) - Image loading and caching library for Android

## License

    Copyright 2017 Melissa Yu Seong Lee

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
