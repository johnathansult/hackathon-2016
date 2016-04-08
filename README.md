# hackathon-2016
This is the collaboration repository for Team PiHome of the 2016 AT&T Hackathon (Hawaii). Team PiHome consisted of two recent graduates and three CS students, working together to design and prototype a smart-home system centered on the Raspberry Pi.

The PiHome was designed to be a home automation hub with a specific eye towards helping the user monitor and decrease their overall energy usage. To assist with this goal, data from a network of distributed sensors (light, heat, human presence, energy draw) was uploaded to AT&T's M2X cloud data platform, which the PiHome base unit would periodically sample and feed into its learning algorithm. The algorithm would determine the user's schedule and automatically control HVAC, motorized blinds, and related devices; the twin goals of this were to A) only run the HVAC and related systems when the user would benefit from the results, and B) automatically change the house's heating and cooling profile by admitting or rejecting sunlight based on current interior and exterior temperatures.

This project contains the prototype of the PiHome mobile app. The PiHome's base unit was scripted in Bash, but the related script files were not uploaded before the completion of the event. An imaged backup of the Pi is available for the curious (16GB) which contains the scripts in their final, judged form.

Data from the temperature and Bluetooth presence sensors was uploaded to the AT&T M2X cloud platform. This data is available from https://m2x.att.com/devices/af223d4c70348e00bae7d9e572b53453 (free account required to view).

Team PiHome won the award for Best Use of AT&T's M2X API.