using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace Mail.Launcher.RNMailLauncher
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNMailLauncherModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNMailLauncherModule"/>.
        /// </summary>
        internal RNMailLauncherModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNMailLauncher";
            }
        }
    }
}
