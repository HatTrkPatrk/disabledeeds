# disabledeeds
Prevent users from creating settlements

With this mod installed, players will be unable to use the settlement foundation form (e.g. from a deed stake) to create settlements. Existing settlements can be modified/expanded; new settlements cannot be created. The configuration file includes a setting to allow players to bypass this restriction based on player power, e.g. GMs. Note: This mod just disables the settlement form. Any other sources of village deeding (if any) will not be blocked (to prevent breaks to other mods, for example).

Tested on a Wurm Unlimited Dedicated Server v1.8.0.3 with ago1024's server modloader version 0.40.

# configuration
The following settings are available:

* gmPower - 0-5, specifices a minimum player power that can bypass the restrictions of this mod. For example, setting this to 5 will allow players of power 5 to still create settlements.

# prerequisites
Requires [SinduskLibrary](https://github.com/Sindusk/sindusklibrary/releases).
