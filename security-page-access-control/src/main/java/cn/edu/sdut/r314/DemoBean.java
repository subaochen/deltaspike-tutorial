/*
 * Copyright 2016 subaochen.
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
package cn.edu.sdut.r314;

import cn.edu.sdut.r314.pages.AdminPages;
import cn.edu.sdut.r314.pages.RootPages;
import javax.enterprise.inject.Model;
import javax.inject.Inject;
import org.apache.deltaspike.core.api.config.view.DefaultErrorView;
import org.apache.deltaspike.core.api.config.view.ViewConfig;
import org.apache.deltaspike.core.api.config.view.navigation.ViewNavigationHandler;

/**
 *
 * @author subaochen
 */
@Model
public class DemoBean {

    @Inject
    private ViewNavigationHandler viewNavigationHandler;

    private void doSomeThing() {
        // do something here
    }

    public Class<? extends ViewConfig> toOtherPage() {
        doSomeThing();
        return RootPages.Other.class;
    }

    //@UserLoggedIn
    public void toAdminPage() {
        viewNavigationHandler.navigateTo(AdminPages.Index.class);
    }
    
    public Class<? extends ViewConfig> toErrorPage(){
        return DefaultErrorView.class;
    }
}
