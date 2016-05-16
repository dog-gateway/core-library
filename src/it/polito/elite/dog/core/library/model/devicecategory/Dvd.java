/*
 * Dog - Core
 *
 * Copyright (c) 2011-2016 Dario Bonino and Luigi De Russis
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */
//
// Automatically generated by the DogOnt2Dog utility
//

package it.polito.elite.dog.core.library.model.devicecategory;


 
 /**
* DvdCategory - automatically generated by DogOnt2Dog
*/


import it.polito.elite.dog.core.library.model.DeviceStatus;
import javax.measure.Measure;

public interface Dvd extends Entertainment
{
	public static int MATCH_TYPE=100;
	public static int MATCH_SUB_TYPE=50;
	public static int MATCH_MANUFACTURER=0;

	public DeviceStatus getState();
	public void rew();
	public void prev();
	public void next();
	public void increaseVolume();
	public void pause();
	public void setVolume(Integer volume);
	public void standBy();
	public void decreaseVolume();
	public void on();
	public void stop();
	public void play();
	public void fwd();
	public void goToTrack(Integer trackNumber);
	public void off();


	/*Generated Notifications*/

	/*Notification: StandByNotification*/
	public void notifyStandby();
	/*Notification: LevelControlNotification*/
	public void notifyChangedLevel(Measure<?,?>  newLevel);
	/*Notification: OffNotification*/
	public void notifyOff();
	/*Notification: ForwardNotification*/
	public void notifyFwd();
	/*Notification: TrackControlNotification*/
	public void notifyChangedTrack(String trackId);
	/*Notification: StopPlaybackNotification*/
	public void notifyStop();
	/*Notification: OnNotification*/
	public void notifyOn();
	/*Notification: RewindNotification*/
	public void notifyRew();
	/*Notification: PlayNotification*/
	public void notifyPlay();
	/*Notification: PausePlaybackNotification*/
	public void notifyPause();
	public void updateStatus();
}
