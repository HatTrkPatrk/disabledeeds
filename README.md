<h1>THIS MOD IS OBSOLETE</h1>
<h2>It likely does not work anymore on the most recent WU version and may cause serious issues if used.</h2>
<h3>If you insist on using it, <b>make frequent backups</b></h3>
<h4>And if you're a developer interested in making it work again, feel free to fork the repository!</h4>

# disabledeeds
Prevent users from creating settlements

With this mod installed, players will be unable to use the settlement foundation form (e.g. from a deed stake) to create settlements. Existing settlements can be modified/expanded; new settlements cannot be created. The configuration file includes a setting to allow players to bypass this restriction based on player power, e.g. GMs. Note: This mod just disables the settlement form. Any other sources of village deeding (if any) will not be blocked (to prevent breaks to other mods, for example).

Tested on a Wurm Unlimited Dedicated Server v1.8.0.3 with ago1024's server modloader version 0.40.

# configuration
The following settings are available:

* gmPower - integer, 0-5, specifices a minimum player power that can bypass the restrictions of this mod. For example, setting this to 5 will allow players of power 5 to still create settlements. Default is 5.

# prerequisites
Requires [SinduskLibrary](https://github.com/Sindusk/sindusklibrary/releases).
