/*
 * Copyright (C) 2017 The MoKee Open Source Project
 *               2017 The LineageOS Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.cyanogenmod.settings.device;

import java.util.HashMap;
import java.util.Map;

class Constants {

    static final String ACTION_INITIALIZE_CM_HARDWARE
            = cyanogenmod.content.Intent.ACTION_INITIALIZE_CM_HARDWARE;

    // Holds <preference_key> -> <proc_node> mapping
    static final Map<String, String> sBooleanNodePreferenceMap = new HashMap<>();
    static final Map<String, String> sStringNodePreferenceMap = new HashMap<>();

    // Holds <preference_key> -> <default_values> mapping
    static final Map<String, Object> sNodeDefaultMap = new HashMap<>();

    static final String[] sButtonPrefKeys = {
        ButtonConstants.BUTTON_SWAP_KEY,
    };

    static {
        sBooleanNodePreferenceMap.put(
                ButtonConstants.BUTTON_SWAP_KEY,
                ButtonConstants.BUTTON_SWAP_NODE);

        sNodeDefaultMap.put(ButtonConstants.BUTTON_SWAP_KEY, false);
    }

}
