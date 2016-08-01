/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.slb.model.v20140515;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.slb.transform.v20140515.ProduceSlbInstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ProduceSlbInstanceResponse extends AcsResponse {

	private String requestId;

	private String data;

	private String code;

	private Boolean success;

	private String message;

	public String getrequestId() {
		return this.requestId;
	}

	public void setrequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getdata() {
		return this.data;
	}

	public void setdata(String data) {
		this.data = data;
	}

	public String getcode() {
		return this.code;
	}

	public void setcode(String code) {
		this.code = code;
	}

	public Boolean getsuccess() {
		return this.success;
	}

	public void setsuccess(Boolean success) {
		this.success = success;
	}

	public String getmessage() {
		return this.message;
	}

	public void setmessage(String message) {
		this.message = message;
	}

	@Override
	public ProduceSlbInstanceResponse getInstance(UnmarshallerContext context) {
		return	ProduceSlbInstanceResponseUnmarshaller.unmarshall(this, context);
	}
}