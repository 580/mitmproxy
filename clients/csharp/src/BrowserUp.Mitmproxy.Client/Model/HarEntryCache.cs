/*
 * BrowserUp MitmProxy
 *
 * ___ This is the REST API for controlling the BrowserUp MitmProxy. The BrowserUp MitmProxy is a swiss army knife for automated testing that captures HTTP traffic in HAR files. It is also useful for Selenium/Cypress tests. ___ 
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = BrowserUp.Mitmproxy.Client.Client.OpenAPIDateConverter;

namespace BrowserUp.Mitmproxy.Client.Model
{
    /// <summary>
    /// HarEntryCache
    /// </summary>
    [DataContract(Name = "HarEntry_cache")]
    public partial class HarEntryCache : IEquatable<HarEntryCache>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="HarEntryCache" /> class.
        /// </summary>
        /// <param name="beforeRequest">beforeRequest.</param>
        /// <param name="afterRequest">afterRequest.</param>
        /// <param name="comment">comment.</param>
        public HarEntryCache(HarEntryCacheBeforeRequest beforeRequest = default(HarEntryCacheBeforeRequest), HarEntryCacheBeforeRequest afterRequest = default(HarEntryCacheBeforeRequest), string comment = default(string))
        {
            this.BeforeRequest = beforeRequest;
            this.AfterRequest = afterRequest;
            this.Comment = comment;
        }

        /// <summary>
        /// Gets or Sets BeforeRequest
        /// </summary>
        [DataMember(Name = "beforeRequest", EmitDefaultValue = false)]
        public HarEntryCacheBeforeRequest BeforeRequest { get; set; }

        /// <summary>
        /// Gets or Sets AfterRequest
        /// </summary>
        [DataMember(Name = "afterRequest", EmitDefaultValue = false)]
        public HarEntryCacheBeforeRequest AfterRequest { get; set; }

        /// <summary>
        /// Gets or Sets Comment
        /// </summary>
        [DataMember(Name = "comment", EmitDefaultValue = false)]
        public string Comment { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class HarEntryCache {\n");
            sb.Append("  BeforeRequest: ").Append(BeforeRequest).Append("\n");
            sb.Append("  AfterRequest: ").Append(AfterRequest).Append("\n");
            sb.Append("  Comment: ").Append(Comment).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as HarEntryCache);
        }

        /// <summary>
        /// Returns true if HarEntryCache instances are equal
        /// </summary>
        /// <param name="input">Instance of HarEntryCache to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(HarEntryCache input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.BeforeRequest == input.BeforeRequest ||
                    (this.BeforeRequest != null &&
                    this.BeforeRequest.Equals(input.BeforeRequest))
                ) && 
                (
                    this.AfterRequest == input.AfterRequest ||
                    (this.AfterRequest != null &&
                    this.AfterRequest.Equals(input.AfterRequest))
                ) && 
                (
                    this.Comment == input.Comment ||
                    (this.Comment != null &&
                    this.Comment.Equals(input.Comment))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.BeforeRequest != null)
                {
                    hashCode = (hashCode * 59) + this.BeforeRequest.GetHashCode();
                }
                if (this.AfterRequest != null)
                {
                    hashCode = (hashCode * 59) + this.AfterRequest.GetHashCode();
                }
                if (this.Comment != null)
                {
                    hashCode = (hashCode * 59) + this.Comment.GetHashCode();
                }
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
