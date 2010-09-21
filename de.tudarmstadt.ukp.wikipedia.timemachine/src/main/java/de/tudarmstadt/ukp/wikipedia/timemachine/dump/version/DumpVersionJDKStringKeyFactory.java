/*******************************************************************************
 * Copyright (c) 2010 Torsten Zesch.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 * 
 * Contributors:
 *     Torsten Zesch - initial API and implementation
 ******************************************************************************/
package de.tudarmstadt.ukp.wikipedia.timemachine.dump.version;

import de.tudarmstadt.ukp.wikipedia.wikimachine.dump.version.IDumpVersion;
import de.tudarmstadt.ukp.wikipedia.wikimachine.dump.version.IDumpVersionFactory;
import de.tudarmstadt.ukp.wikipedia.wikimachine.hashing.StringHashCodeDisabled;

public class DumpVersionJDKStringKeyFactory implements IDumpVersionFactory {

	@Override
	public IDumpVersion getDumpVersion() {
		IDumpVersion dumpVersion = null;
		try {
			dumpVersion = new DumpVersionJDKGeneric<String, StringHashCodeDisabled>(
					StringHashCodeDisabled.class);
		} catch (Exception e) {
			dumpVersion = null;
		}
		return dumpVersion;
	}

}