/**
 * Copyright (c) 2001-2020 Mathew A. Nelson and Robocode contributors
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * https://robocode.sourceforge.io/license/epl-v10.html
 */
using Robocode;

namespace net.sf.robocode.security
{
#pragma warning disable 1591
    /// <exclude/>
    public interface IHiddenStatusHelper
    {
        RobotStatus createStatus(double energy, double x, double y, double bodyHeading, double gunHeading,
                                 double radarHeading,
                                 double velocity, double bodyTurnRemaining, double radarTurnRemaining,
                                 double gunTurnRemaining,
                                 double distanceRemaining, double gunHeat, int others, int numSentries,
                                 int roundNum, int numRounds, long time);
    }
}

//happy