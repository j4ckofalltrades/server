/*
Stream-Pi - Free & Open-Source Modular Cross-Platform Programmable Macropad
Copyright (C) 2019-2021  Debayan Sutradhar (rnayabed),  Samuel Quiñones (SamuelQuinones)

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.
This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

Written by : Debayan Sutradhar (rnayabed)
*/

package com.stream_pi.server.info;

public class License {
    /**
     * @return Formatted String containing the Stream-Pi License an also licenses of other opensource libraries used.
     */
    public static String getLicense()
    {
        return "Stream-Pi - Free & Open-Source Modular Cross-Platform Programmable Macro Pad\n" +
            "Copyright (C) 2019-2021  Debayan Sutradhar (rnayabed),  Samuel Quiñones (SamuelQuinones)\n" +
            "\n" +
            "This program is free software: you can redistribute it and/or modify\n" +
            "it under the terms of the GNU General Public License as published by\n" +
            "the Free Software Foundation, either version 3 of the License, or\n" +
            "(at your option) any later version.\n" +
            "\n" +
            "This program is distributed in the hope that it will be useful,\n" +
            "but WITHOUT ANY WARRANTY; without even the implied warranty of\n" +
            "MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the\n" +
            "GNU General Public License for more details.\n" +
            "\n\n"+
            "Opensource Libraries used :\n"+
            "1. JavaFX - GNU General Public License with Classpath Exception\nhttp://openjdk.java.net/legal/gplv2+ce.html\n\n"+
            "2. JSON - The JSON License\nhttps://www.json.org/license.html\n\n"+
            "3. Ikonli - Apache License\nhttps://github.com/kordamp/ikonli/blob/master/LICENSE\n\n"+
            "4. Roboto Font - Apache License 2.0\nhttp://www.apache.org/licenses/LICENSE-2.0\n\n" +
            "5. ControlsFX - BSD 3-Clause License\nhttps://github.com/controlsfx/controlsfx/blob/jfx-13/license.txt\n\n";
    }
}
