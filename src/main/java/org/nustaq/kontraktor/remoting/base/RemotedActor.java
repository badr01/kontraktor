/*
Kontraktor Copyright (c) Ruediger Moeller, All rights reserved.

This library is free software; you can redistribute it and/or
modify it under the terms of the GNU Lesser General Public
License as published by the Free Software Foundation; either
version 3.0 of the License, or (at your option) any later version.

This library is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
Lesser General Public License for more details.

See https://www.gnu.org/licenses/lgpl.txt
*/

package org.nustaq.kontraktor.remoting.base;

/**
 * optional interface implementing some notification callbacks
 * related to remoting.
 */
public interface RemotedActor {

    /**
     * notification method called once an actor has been unpublished. E.g. in case of a ClientSession role
     * actor, this will be called once the client disconnects or times out
     */
    public void hasBeenUnpublished();

}
