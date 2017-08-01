/*
 * Copyright (c) 2017 The MoKee Open Source Project
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

package com.cyanogenmod.pocketmode;

import android.content.Context;

import cyanogenmod.providers.CMSettings;

import org.cyanogenmod.internal.util.FileUtils;

import static org.cyanogenmod.platform.internal.R.bool.config_proximityCheckOnWake;
import static org.cyanogenmod.platform.internal.R.bool.config_proximityCheckOnWakeEnabledByDefault;

class Utils {

    static boolean isSupported(Context content) {
        return content.getResources().getBoolean(config_proximityCheckOnWake) &&
                FileUtils.isFileWritable(Constants.FP_DISABLE_NODE);
    }

    private static boolean isEnabledByDefault(Context content) {
        return content.getResources().getBoolean(
                config_proximityCheckOnWakeEnabledByDefault);
    }

    static boolean isEnabled(Context content) {
        return CMSettings.System.getInt(content.getContentResolver(),
                CMSettings.System.PROXIMITY_ON_WAKE,
                isEnabledByDefault(content) ? 1 : 0) != 0;
    }

}
