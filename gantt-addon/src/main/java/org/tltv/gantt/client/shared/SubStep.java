/*
 * Copyright 2015 Tomi Virtanen
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.tltv.gantt.client.shared;

public class SubStep extends AbstractStep {

    public SubStep() {
    }

    public SubStep(String caption) {
        super(caption);
    }

    public SubStep(String caption, CaptionMode captionMode) {
        super(caption, captionMode);
    }

    private Step owner;

    public Step getOwner() {
        return owner;
    }

    protected void setOwner(Step owner) {
        this.owner = owner;
    }

}
